package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        DefaultTableModel model = new DefaultTableModel();

        // Create the JTable and set the model
        JTable table = new JTable(model);

        // Add columns to the model
        model.addColumn("Column 1");
        model.addColumn("Column 2");

        // Add some initial rows of data
        model.addRow(new Object[]{"Data 1", "Data 2"});
        model.addRow(new Object[]{"Data 3", "Data 4"});

        // Create a custom header panel
        JPanel customHeader = new JPanel();
        customHeader.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JLabel headerLabel = new JLabel("Custom Table Header");
        customHeader.add(headerLabel);

        // Create a button to delete all rows
        JButton deleteButton = new JButton("Delete All Rows");
        deleteButton.addActionListener(e -> {
            removeAllRows(model);
        });

        // Use a JScrollPane to display the table
        JScrollPane scrollPane = new JScrollPane(table);

        // Create a panel to hold the table and custom header
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(customHeader, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add components to the frame
        frame.add(mainPanel);
        frame.add(deleteButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
    }

    // Custom method to remove all rows from the DefaultTableModel
    private static void removeAllRows(DefaultTableModel model) {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
}
