import java.util.*;

import javax.lang.model.util.ElementScanner6;

// class Quiz6 {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("x값: ");
    // int x = sc.nextInt();
    // System.out.print("y값: ");
    // int y = sc.nextInt();
    // System.out.print("z값: ");
    // int z = sc.nextInt();

    // System.out.println("x, y의 최솟값은" + Min(x, y) + " 입니다.");
    // System.out.println("x, y의 최댓값은" + Max(x, y) + " 입니다.");
    // System.out.println("x, y, z의 최솟값은" + Min(x, y, z) + " 입니다.");
    // System.out.println("x, y, z의 최솟값은" + Max(x, y, z) + " 입니다.");
    // }

    // public static int Min(int x, int y) {
    //     if(x < y) {
    //         return x;
    //     } else {
    //         return y;
    //     }
    // }
    // public static int Max(int x, int y) {
    //     if(x < y) {
    //         return y;
    //     } else {
    //         return x;
    //     }
    // }
    // public static int Min(int x, int y, int z) {
    //     if(y > x && z > x) {
    //         return x;
    //     } else if (x > y && z > y) {
    //         return y;
    //     } else {
    //         return z;
    //     }
    // }
    // public static int Max(int x, int y, int z) {
    //     if(y < x && z < x) {
    //         return x;
    //     } else if (x < y && z < y) {
    //         return y;
    //     } else {
    //         return z;
    //     }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("x값: ");
    // int x = sc.nextInt();
    // System.out.print("y값: ");
    // int y = sc.nextInt();
    // System.out.print("z값: ");
    // int z = sc.nextInt();

    // System.out.print("배열 a의 요소 수 :");
    // int n = sc.nextInt();
    // int[] a = new int[n];
    // for(int i = 0; i < n; i++) {
    //     System.out.print("a[" + i + "] :");
    //     a[i] = sc.nextInt();
    // }

    // System.out.println("x, y의 최솟값은" + min(x, y) + " 입니다.");
    // System.out.println("x, y의 최댓값은" + max(x, y) + " 입니다.");
    // System.out.println("x, y, z의 최솟값은" + min(x, y, z) + " 입니다.");
    // System.out.println("x, y, z의 최솟값은" + max(x, y, z) + " 입니다.");
    // System.out.println("배열 a의 최솟값은" + min(a) + " 입니다.");
    // System.out.println("배열 a의 최댓값은" + max(a) + " 입니다.");
    // System.out.println("인덱스는 {" + minIndexArr(a) + "} 입니다.");
    // }

    // public static int min(int x, int y) {
    //     return x < y ? x : y;
    // }

    // public static int max(int x, int y) {
    //     return x > y ? x : y;
    // }

    // public static int min(int x, int y, int z) {
    //     int min = x;
    //     if(y < min) min = y;
    //     if(z < min) min = z;
    //     return min;
    // }

    // public static int max(int x, int y, int z) {
    //     int max = x;
    //     if(y > max) max = y;
    //     if(z > max) max = z;
    //     return max;
    // }

    // public static int min(int[] a) {
    //     int min = a[0];
    //     for(int i = 1; i < a.length; i++) {
    //         if(a[i] < min) min = a[i];
    //     }
    //     return min;
    // }
    
    // public static int max(int[] a) {
    //     int max = a[0];
    //     for(int i = 1; i < a.length; i++) {
    //         if(a[i] > max) max = a[i];
    //     }
    //     return max;
    // }

    // public static int[] minIndexArr(int[] a) {
    //     int min = min(a);
    //     int count = 0;
    //     for(int i = 1; i < a.length; i++) {
    //         if(a[i] == min)
    //         count++;
    //     }
    //     int[] c = new int[count--];
    //     for(int i = a.length - 1; count >= 0; i--) {
    //         if(a[i] == min) {
    //             c[count--] = i;
    //         }
    //     }
    //     System.out.println(c);
    //     return c;

////////////////////////////////////////////////////////////////

//     abstract class Animal {
//         private String name;
//         public Animal(String name) {
//             this.name = name;
//         }
//         public abstract void bark();
      
//         public String getName() {
//             return name;
//         }
//         public void introduce() {
//             System.out.print(toString() + "이다.");
//             bark();
//         }
//     }
      
//     class Dog extends Animal {
//         private String type;  //개 종류
//         public Dog(String name, String type) { // 생성자
//             super(name);this.type = type;
//         }
//         public void bark() {
//             System.out.println("멍멍!"); // 짖기
//         }
//         public String toString() {
//             return type + "의 " + getName();
//         }
//     }
      
//     class Cat extends Animal {
//         int age;  // 고양이의 나이
//         public Cat(String name, int age) {
//             super(name);this.age = age;
//         }
//         public void bark() {
//             System.out.println("냐옹!");
//         }
//         public String toString() {
//             return age + "살의 " + getName();
//         }
//     }
//     class Quiz6 {
//     public static void main(String[] args) {
//         Animal[] a = new Animal[2];
//         a[0] = new Dog("뭉치", "치와와");
//         a[1] = new Cat("마이클", 7);

//         for(int i = 0; i < a.length; i++) {
//             System.out.println("a[" + i + "] = " + a[i]);
//         }
//         for(int i = 0; i < a.length; i++) {
//             System.out.print("a[" + i + "] = ");
//             a[i].introduce();
//         }

//         // System.out.print(a[0].getName() + " ");
//         // a[0].bark();
//         // System.out.print(a[1].getName() + " ");
//         // a[1].bark();
//     }
// }

/////////////////////////////////////////////////////////////////

// abstract class Player {
//     int hand; //손 (가위 바위 보)
// }
      
// // 사람 손
// class Human extends Player {
//     Scanner sc = new Scanner(System.in);
      
//     public int humanHand() {
//         do {
//             System.out.print("가위바위보!!!0...바위/1...가위/2...보");
//             hand = sc.nextInt();
//         } while(hand < 0 || hand > 2);
//         return hand;
//     }
// }
      
// // 컴퓨터 손
// class Computer extends Player {
//     Random rand = new Random();
      
//     public int ComputerHand() {
//         return rand.nextInt(3);
//     }
// }
      
// class Quiz6 {
//     public static void main(String[] args) {
      
//         Human hp = new Human();
//         Computer cp = new Computer();
//         String[] hands = {"가위","바위","보"};
      
//         int humanHand = hp.humanHand();
//         int computerHand = cp.ComputerHand();
      
//         System.out.println("나는 "+hands[humanHand]+"이고, 당신은"+hands[computerHand]+"입니다. ");     
//         System.out.println(rockpaperscissor(computerHand, humanHand));
//     }

//     public static String rockpaperscissor(int com, int per) {
//         if((com - per == -1) || (com - per == 2))
//             return "당신이 졌습니다.";

//         else if(com - per == 0)
//             return "비겼습니다.";
        
//         else
//             return "당신이 이겼습니다.";
//     }
// }

// class Quiz6 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("문자열 :");
//         String s = sc.next();
//         System.out.print("반대로 읽으면");

//         for(int i = s.length() -1; i >= 0; i-- ) {
//             System.out.print(s.charAt(i));
//         }

//         System.out.print("입니다.");
//     }
// }

class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 s1 :");
        String s1 = sc.next();
        System.out.print("문자열 s2 :");
        String s2 = sc.next();

        int idx = s1.indexOf(s2);
        if(idx == -1)
            System.out.println("s1안에 s2가 포함되어있지 않습니다.");
        else {
            System.out.println(s1);
            for(int i = 0; i < idx; i++) {
                System.out.print(" ");
            }
            System.out.println(s2);
        }
    }
}