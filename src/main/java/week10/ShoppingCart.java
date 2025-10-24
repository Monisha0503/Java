import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ShoppingCart extends JFrame {
    private JTextField itemNameField, itemPriceField;
    private JButton addButton;
    private JTable cartTable;
    private DefaultTableModel tableModel;
    private JLabel totalLabel;
    private java.util.List<CartItem> cartItems;

    public ShoppingCart() {
        setTitle("Shopping Cart");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        cartItems = new ArrayList<>();

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Item Name:"));
        itemNameField = new JTextField(15);
        inputPanel.add(itemNameField);

        inputPanel.add(new JLabel("Price:"));
        itemPriceField = new JTextField(7);
        inputPanel.add(itemPriceField);

        addButton = new JButton("Add to Cart");
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.NORTH);

        String[] columns = {"Item Name", "Price"};
        tableModel = new DefaultTableModel(columns, 0);
        cartTable = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(cartTable);
        add(tableScroll, BorderLayout.CENTER);

        JPanel totalPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        totalLabel = new JLabel("Total: $0.00");
        totalPanel.add(totalLabel);
        add(totalPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addItemToCart());

        setVisible(true);
    }

    private void addItemToCart() {
        String name = itemNameField.getText().trim();
        String priceText = itemPriceField.getText().trim();

        if (name.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Please enter both item name and price.", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double price;
        try {
            price = Double.parseDouble(priceText);
            if (price < 0) {
                JOptionPane.showMessageDialog(this, 
                    "Price cannot be negative.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Invalid price format.", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        CartItem item = new CartItem(name, price);
        cartItems.add(item);
        tableModel.addRow(new Object[]{name, String.format("$%.2f", price)});

        updateTotal();
        itemNameField.setText("");
        itemPriceField.setText("");
    }

    private void updateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getPrice();
        }
        totalLabel.setText(String.format("Total: $%.2f", total));
    }

    private static class CartItem {
        private String name;
        private double price;

        public CartItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShoppingCart::new);
    }
}