package labExercise;

import java.awt.*;
import java.awt.event.*;

public class TodoListManager extends Frame implements ActionListener {
    private TextArea todoTextArea;
    private TextField taskNameField, taskDescriptionField;
    private Button addButton, editButton, deleteButton;
    private String selectedTask = "";

    public TodoListManager() {
        setTitle("To-Do List Manager");
        setSize(400, 300);
        setLayout(new FlowLayout());

        Label taskNameLabel = new Label("Task Name:");
        taskNameField = new TextField(20);

        Label taskDescriptionLabel = new Label("Description:");
        taskDescriptionField = new TextField(20);

        addButton = new Button("Add");
        addButton.addActionListener(this);

        editButton = new Button("Edit");
        editButton.addActionListener(this);

        deleteButton = new Button("Delete");
        deleteButton.addActionListener(this);

        todoTextArea = new TextArea(10, 30);

        add(taskNameLabel);
        add(taskNameField);
        add(taskDescriptionLabel);
        add(taskDescriptionField);
        add(addButton);
        add(editButton);
        add(deleteButton);
        add(todoTextArea);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String taskName = taskNameField.getText();
            String taskDescription = taskDescriptionField.getText();
            if (!taskName.isEmpty()) {
                todoTextArea.append(taskName + ": " + taskDescription + "\n");
                taskNameField.setText("");
                taskDescriptionField.setText("");
            } else {
                showMessageDialog("Task Name cannot be empty!");
            }
        } else if (e.getSource() == editButton) {
            String updatedTaskName = taskNameField.getText();
            String updatedTaskDescription = taskDescriptionField.getText();
            if (!updatedTaskName.isEmpty()) {
                if (!selectedTask.isEmpty()) {
                    String currentText = todoTextArea.getText();
                    String updatedText = currentText.replace(selectedTask, updatedTaskName + ": " + updatedTaskDescription);
                    todoTextArea.setText(updatedText);
                    selectedTask = "";
                    taskNameField.setText("");
                    taskDescriptionField.setText("");
                } else {
                    showMessageDialog("Please select a task to edit!");
                }
            } else {
                showMessageDialog("Task Name cannot be empty!");
            }
        } else if (e.getSource() == deleteButton) {
            if (!selectedTask.isEmpty()) {
                String currentText = todoTextArea.getText();
                String updatedText = currentText.replace(selectedTask + "\n", "");
                todoTextArea.setText(updatedText);
                selectedTask = "";
                taskNameField.setText("");
                taskDescriptionField.setText("");
            } else {
                showMessageDialog("Please select a task to delete!");
            }
        }
    }

    private void showMessageDialog(String message) {
        Dialog dialog = new Dialog(this, "Message", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
        dialog.add(okButton);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new TodoListManager();
    }
}
