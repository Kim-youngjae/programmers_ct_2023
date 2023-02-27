package com.lec.plion09;

public class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("홍길동", 22);
        사람 a사람2 = new 사람("홍길동", 22);

        if (a사람1.equals("ㅋㅋ")) {
            System.out.println("같습니다1");
        } else {
            System.out.println("틀립니다1");
        }

        if (a사람1.equals(a사람2)) {
            System.out.println("같습니다2");
        } else {
            System.out.println("틀립니다2");
        }
    }

}

class 사람 {
    String 이름;
    int 나이;

    사람(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof 사람)) {
            return false;
        }
        사람 사람obj = (사람) obj;
        if (this.이름.equals(사람obj.이름) && this.나이 == 사람obj.나이) {
            return true;
        }
        return false;
    }
}