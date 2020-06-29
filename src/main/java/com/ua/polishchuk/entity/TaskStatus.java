package com.ua.polishchuk.entity;

import java.util.Arrays;

public enum  TaskStatus {
    VIEW,
    IN_PROGRESS,
    DONE;

    public static boolean contains(String taskStatus){
        return Arrays.stream(TaskStatus.values())
                .anyMatch(status -> status.toString().equals(taskStatus));
    }
}
