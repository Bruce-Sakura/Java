package com.sqa.class5;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List numbers = new ArrayList();

        JFrame jframe = new JFrame("我是标题");
//        frame.setTitle("hello");
        jframe.setSize(500, 600);
        jframe.setLocationRelativeTo(null); // Keep in center
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 关程序

        jframe.setLayout(new GridLayout(2, 1));

//        JTextField num1TextField = new JTextField();
//        JTextField num2TextField = new JTextField();

        JLabel resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 30));  // Arial 字体，粗体，大小为 24
        resultLabel.setOpaque(true); // 设置标签背景颜色生效

//        JLabel num1Label = new JLabel("第一个数字");
//        JLabel num2Label = new JLabel("第二个数字");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4)); // 5行4列，按钮间隔10px

        // 创建按钮
        String[] numberLabels = {
                "", "", "A/C", "=",
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "", "0", "", "/"};
        JButton[] Buttons = new JButton[numberLabels.length];

        // 创建数字按钮并添加监听器
        for (int i = 0; i < numberLabels.length; i++) {
            Buttons[i] = new JButton(numberLabels[i]);
            Buttons[i].setFont(new Font("Arial", Font.PLAIN, 24)); // 设置字体
            Buttons[i].setForeground(Color.BLACK);  // 字体颜色
            Buttons[i].setBackground(Color.WHITE);  // 按钮背景色

            // 添加监听器
            Buttons[i].addActionListener(e -> {
                String command = e.getActionCommand();  // 获取按钮的文本

                if (command.equals("=")) {
                    Object result = calculation(numbers);
                    resultLabel.setText(String.valueOf(result));
                } else if (command.equals("A/C")) {
                    // 清除所有输入
                    numbers.clear();
                    resultLabel.setText("");
                } else {
                    // 普通数字按钮的处理
                    numbers.add(command); // 将数字或符号添加到 numbers 列表中
                    String currentText = resultLabel.getText();  // 获取当前显示的文本
                    resultLabel.setText(currentText + command);  // 追加新文本
                }
            });
            buttonPanel.add(Buttons[i]); // 将按钮添加到面板
        }

//        ActionListener numberListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    String num = e.getActionCommand();
//                    switch (num) {
//                        case "1":
//                            resultLabel.setText("1");
//                            numbers.add(1);
//                            break;
//                        case "2":
//                            resultLabel.setText("2");
//                            numbers.add(2);
//                            break;
//                        case "3":
//                            resultLabel.setText("3");
//                            numbers.add(3);
//                            break;
//                        case "4":
//                            resultLabel.setText("4");
//                            numbers.add(4);
//                            break;
//                        case "5":
//                            resultLabel.setText("5");
//                            numbers.add(5);
//                            break;
//                        case "6":
//                            resultLabel.setText("6");
//                            numbers.add(6);
//                            break;
//                        case "7":
//                            resultLabel.setText("7");
//                            numbers.add(7);
//                            break;
//                        case "8":
//                            resultLabel.setText("8");
//                            numbers.add(8);
//                            break;
//                        case "9":
//                            resultLabel.setText("9");
//                            numbers.add(9);
//                            break;
//                        case "0":
//                            resultLabel.setText("0");
//                            numbers.add(0);
//                            break;
//                        default:
//                            break;
//                    }
//                } catch (Exception ex) {
//                    resultLabel.setText("Error");
//                }
//            }
//        };
//        ActionListener actionListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
////                    double num1 = Double.parseDouble(num1TextField.getText());
////                    double num2 = Double.parseDouble(num2TextField.getText());
//                    double result = 0;
//                    String op = e.getActionCommand();
//                    switch (op) {
//                        case "+":
//
//                    }
////                    if (op.equals("+")) {
////                        result = num1 + num2;
////                    } else if (op.equals("-")) {
////                        result = num1 - num2;
////                    } else if (op.equals("*")) {
////                        result = num1 * num2;
////                    } else if (op.equals("/")) {
////                        if (num2 != 0) {
////                            result = num1 / num2;
////                        }
////                        resultLabel.setText("Error!!!! No 0");
////                        return;
////                    }
//                    resultLabel.setText("结果: " + result);
//                } catch (Exception ex) {
//                    resultLabel.setText("Error!");
//                }
//
//            }
//        };

//        buttonPanel.setLayout(new GridLayout(5, 4));
//        JButton addBtn = new JButton("+");
//        JButton subBtn = new JButton("-");
//        JButton mulBtn = new JButton("*");
//        JButton divBtn = new JButton("/");
//
//        JButton oneBtn = new JButton("1");
//        JButton twoBtn = new JButton("2");
//        JButton threeBtn = new JButton("3");
//        JButton fourBtn = new JButton("4");
//        JButton fiveBtn = new JButton("5");
//        JButton sixBtn = new JButton("6");
//        JButton sevenBtn = new JButton("7");
//        JButton eightBtn = new JButton("8");
//        JButton nineBtn = new JButton("9");
//        JButton zeroBtn = new JButton("0");
//
//        JButton acBtn = new JButton("A/C");
//        JButton equalBtn = new JButton("=");
//
//        JButton emptyButton = new JButton("（￣︶￣）");
//
//
//        buttonPanel.add(emptyButton);
//        buttonPanel.add(emptyButton);
//        buttonPanel.add(acBtn);
//        buttonPanel.add(equalBtn);
//
//        buttonPanel.add(oneBtn);
//        buttonPanel.add(twoBtn);
//        buttonPanel.add(threeBtn);
//        buttonPanel.add(addBtn);
//
//        buttonPanel.add(fourBtn);
//        buttonPanel.add(fiveBtn);
//        buttonPanel.add(sixBtn);
//        buttonPanel.add(subBtn);
//
//        buttonPanel.add(sevenBtn);
//        buttonPanel.add(eightBtn);
//        buttonPanel.add(nineBtn);
//        buttonPanel.add(mulBtn);
//
//        buttonPanel.add(emptyButton);
//        buttonPanel.add(zeroBtn);
//        buttonPanel.add(divBtn);


//        addBtn.addActionListener(actionListener);
//        subBtn.addActionListener(actionListener);
//        mulBtn.addActionListener(actionListener);
//        divBtn.addActionListener(actionListener);
//
//        oneBtn.addActionListener(numberListener);
//        twoBtn.addActionListener(numberListener);
//        threeBtn.addActionListener(numberListener);
//        fourBtn.addActionListener(numberListener);
//        fiveBtn.addActionListener(numberListener);
//        sixBtn.addActionListener(numberListener);
//        sevenBtn.addActionListener(numberListener);
//        eightBtn.addActionListener(numberListener);
//        nineBtn.addActionListener(numberListener);
//        zeroBtn.addActionListener(numberListener);

//        jframe.add(num1Label);
//        jframe.add(num1TextField);
//        jframe.add(num2Label);
//        jframe.add(num2TextField);

        jframe.add(resultLabel);
        jframe.add(buttonPanel);
        jframe.setVisible(true);
    }

    private static Object calculation(List<String> numbers) {
        String formula = String.join("", numbers); // 拼接成字符串
        System.out.println("formula: " + formula);

        try {
            double result = evaluateExpression(formula);
            System.out.println("计算结果: " + result);
            return result;
        } catch (Exception e) {
            System.out.println("表达式错误: " + e.getMessage());
            return null;
        }
    }

    public static double evaluateExpression(String expression) {
        List<String> tokens = tokenize(expression);
        Queue<String> rpnQueue = infixToRPN(tokens);
        return evaluateRPN(rpnQueue);
    }

    private static List<String> tokenize(String expression) {
        List<String> tokens = new ArrayList<>();
        StringBuilder numBuffer = new StringBuilder();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                numBuffer.append(c);
            } else {
                if (numBuffer.length() > 0) {
                    tokens.add(numBuffer.toString());
                    numBuffer.setLength(0);
                }
                tokens.add(String.valueOf(c));
            }
        }

        if (numBuffer.length() > 0) {
            tokens.add(numBuffer.toString());
        }

        return tokens;
    }

    private static Queue<String> infixToRPN(List<String> tokens) {
        Map<String, Integer> precedence = Map.of(
                "+", 1, "-", 1, "*", 2, "/", 2
        );

        Queue<String> output = new LinkedList<>();
        Stack<String> operators = new Stack<>();

        for (String token : tokens) {
            if (token.matches("\\d+(\\.\\d+)?")) { // 数字
                output.add(token);
            } else { // 运算符
                while (!operators.isEmpty() && precedence.getOrDefault(operators.peek(), 0) >= precedence.get(token)) {
                    output.add(operators.pop());
                }
                operators.push(token);
            }
        }

        while (!operators.isEmpty()) {
            output.add(operators.pop());
        }

        return output;
    }

    private static double evaluateRPN(Queue<String> rpnQueue) {
        Stack<Double> stack = new Stack<>();

        while (!rpnQueue.isEmpty()) {
            String token = rpnQueue.poll();

            if (token.matches("\\d+(\\.\\d+)?")) { // 数字
                stack.push(Double.parseDouble(token));
            } else { // 运算符
                double b = stack.pop();
                double a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
