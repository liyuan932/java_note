package com.javanote.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @author wb-liyuan.j
 * @date 2017/7/11
 */
public class StreamsTest {

    private enum Status {
        OPEN, CLOSED
    }
    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList( //
            new Task(Status.OPEN, 5),
            new Task(Status.OPEN, 13),
            new Task(Status.CLOSED, 8)
        );

        int sum = tasks.stream()
            .filter(task -> task.getStatus() == Status.OPEN)
            .mapToInt(Task::getPoints).sum();
        System.out.println(sum);

        int totalPoints = tasks.stream()
            .parallel()
            .map(Task::getPoints)
            .reduce(0, Integer::sum);
        System.out.println( "Total points (all tasks): " + totalPoints );

        Map<Status, List<Task>> map  = tasks.stream().
            collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(map);

    }
}
