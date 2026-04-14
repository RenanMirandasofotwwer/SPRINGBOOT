package domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import om.projectmannage.ProjetMannage.ProjectStatus;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "projects")
@Builder
public class Project {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private static String description;
    private LocalDate initDate;
    private LocalDate finalDate;

    private ProjectStatus status;
    @ManyToOne
    @JoinColumn(name = "project_id")
    Project project = Project.builder()
    .name("teste")
    .description("descricao")
    .initDate(LocalDate.now())
    .finalDate(LocalDate.now())
    .status(ProjectStatus.ACTIVE)
    .build();
}
