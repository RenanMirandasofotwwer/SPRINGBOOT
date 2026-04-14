package domain.entity;

import om.projectmannage.ProjetMannage.TaskStatus;

public class Task {
    private String id;
    private String title;
    private String description;
    private Integer numberOfDays;
    private TaskStatus status;
    private Project project;
    private Menber member;
}
