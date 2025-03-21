package org.example;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String status);
}

// Subject Interface
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

// Concrete Subject (Công việc)
class Task implements Subject {
    private String title;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Task(String title, String status) {
        this.title = title;
        this.status = status;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getTitle() {
        return title;
    }
}

// Concrete Observer (Thành viên nhóm)
class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " nhận được thông báo: Trạng thái công việc thay đổi thành '" + status + "'");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng công việc và thành viên nhóm
        Task task = new Task("Phát triển tính năng", "Đang thực hiện");
        TeamMember member1 = new TeamMember("Thành viên A");
        TeamMember member2 = new TeamMember("Thành viên B");

        // Đăng ký các thành viên nhóm
        task.attach(member1);
        task.attach(member2);

        // Thay đổi trạng thái công việc
        task.setStatus("Hoàn thành");  // Thông báo cho tất cả thành viên

        // Hủy đăng ký
        task.detach(member1);
        task.setStatus("Đang kiểm tra");  // Chỉ thông báo cho Thành viên B
    }
}
