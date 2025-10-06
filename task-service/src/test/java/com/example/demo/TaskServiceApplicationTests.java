package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskServiceApplicationTests {

	@Test
    void testTaskCreation() {
        Task task = new Task();
        task.setTitle("Test Title");
        task.setDescription("Test Description");
        task.setStatus(Task.Status.PENDING);

        assertThat(task.getTitle()).isEqualTo("Test Title");
        assertThat(task.getDescription()).isEqualTo("Test Description");
        assertThat(task.getStatus()).isEqualTo(Task.Status.PENDING);
    }

}
