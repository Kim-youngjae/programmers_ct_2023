package com.lec.plion22Polynomial;


// 후위 표기식 구현

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

class Polynomial {
    private static String my_string;

    Polynomial(String my_string) {
        this.my_string = my_string;
    }

    public static int calc() {
        //공백을 제거
        String strWithoutBlank = my_string.replaceAll(" ", "");

        //연산 기호를 저장
        List<String> calcList = new ArrayList<>();

        // 숫자를 저장
        List<Integer> numList = new ArrayList<>();

        // 2자리나 3자리 숫자가 있을 수 있어 정규식으로 따로 나눔
        String[] parsedNum = strWithoutBlank.split("[+,-,*,/]");

        System.out.println("Arrays.toString(parsedNum) = " + Arrays.toString(parsedNum));

        // 나눈 것을 숫자리스트에 저장
        for (String s : parsedNum) {
            numList.add(Integer.valueOf(s));
        }

        // 연산자만 따로 저장
        for (char c : strWithoutBlank.toCharArray()) {
            if (!(Character.isDigit(c))) {
                calcList.add(String.valueOf(c));
            }
        }

        // 연산 시작
        Iterator<String> iterator = calcList.iterator();
        int sum = numList.get(0);
        int idx = 1;

        while (iterator.hasNext()) {
            String next = iterator.next();
            switch (next) {
                case "+":
                    sum += numList.get(idx++);
                    break;
                case "-":
                    sum -= numList.get(idx++);
                    break;
                case "*":
                    sum *= numList.get(idx++);
                    break;
                case "/":
                    sum /= numList.get(idx++);
                    break;
            }
        }

        return sum;
    }

    public static int calc2() {
        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        String strNum = my_string.replaceAll(" ", "");
        char[] chars = strNum.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                list.add(String.valueOf(chars[i])); // 숫자라면 출력(리스트에 저장)
            } else {
                // 연산자면 stack에 푸시
                String s = String.valueOf(chars[i]);
//                String s = Character.toString(chars[i]);
                if (s.equals("+") || s.equals("-")) { // + - 를 만나면 모두 꺼내기
                    while (!stack.isEmpty()) {
                        if (stack.peek().equals("(")) {
                            break;
                        }
                        list.add(stack.pop());
                    }
                    stack.push(s);
                } else if (s.equals("*") || s.equals("/")) { // * / 는 모두 푸시
                    stack.push(s);
                } else if (s.equals("(")) {
                    stack.push(s);
                } else if (s.equals(")")) { // ) 닫는 괄호를 만나면
                    while (!stack.isEmpty()) { // ( 여는 괄호 만날 때까지 pop하기
                        if (stack.peek().equals("(")) {
                            stack.pop();
                            break;
                        }
                        list.add(stack.pop());
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        // 계산
        Stack<Integer> stack2 = new Stack<>();

        for (String s : list) { // 후위 표기법 대로 들어간 리스트를 하나씩 빼면서
            if (s.matches("[0-9]")) { // 숫자는 스택에 넣어줌
                // 숫자면 변환
                stack2.push(Integer.valueOf(s));
            } else { // 연산자를 만나면
                int n1 = stack2.pop(); // 두 개씩 빼서 연산
                int n2 = stack2.pop();
                switch (s) {
                    case "+":
                        stack2.push(n2 + n1); // 연산한 값 다시 스택에 넣어주기
                        break;
                    case "-":
                        stack2.push(n2 - n1);
                        break;
                    case "*":
                        stack2.push(n2 * n1);
                        break;
                    case "/":
                        stack2.push(n2 / n1);
                        break;
                }
            }
        }

        Integer answer = stack2.pop();
        System.out.println("answer = " + answer);

        stack.clear();
        stack2.clear();
        return answer;
    }

    public static int calc3() {
        // 재귀를 이용한 괄호가 포함된 사칙연산

        return 0;
    }
}

