import java.util.*;

public class Solving_Problems_woncheol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        List<Integer> answerList = new ArrayList<>();

        String[] quesArr = {"1. Python에서 변수를 선언하는 방법은? (점수: 10점)", "2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)",
                "3. Python에서 조건문을 작성하는 방법은? (점수: 10점)", "4. Python에서 함수를 정의하는 방법은? (점수: 5점)"};
        String[] quesArr01 = {"var name", "name = value", "set name", "name == value"};
        String[] quesArr02 = {"순서가 있고 변경 가능하다", "중복된 값을 가질 수 없다", "원소를 추가하거나 삭제할 수 없다", "정렬된 상태로 유지된다"};
        String[] quesArr03 = {"if-else", "for-in", "while", "def"};
        String[] quesArr04 = {"class", "def", "import", "return"};
        List<String> quesList01 = Arrays.asList(quesArr01);
        List<String> quesList02 = Arrays.asList(quesArr02);
        List<String> quesList03 = Arrays.asList(quesArr03);
        List<String> quesList04 = Arrays.asList(quesArr04);
        List[] questionArr = {quesList01, quesList02, quesList03, quesList04};

//        Integer[] indexArr = {1,2,3,4};
//        List<Integer> indexList = Arrays.asList(indexArr);
//        Collections.shuffle(indexList);
//        for (int i = 0; i < indexList.size(); i++) {
//            System.out.println(indexList.get(i));
//        }

        for (int i = 0; i < quesArr.length; i++) {
            System.out.println(quesArr[i]);
            Collections.shuffle(questionArr[i]);
            for (int j = 0; j < questionArr[i].size(); j++) {
                if (j > 0) System.out.print(" ");
                System.out.print((j + 1) + ") " + questionArr[i].get(j));
            }
            System.out.print("\n" + "-정답 : ");
            int answer = scanner.nextInt();
            answerList.add(answer);
            if (questionArr[i].get(answer - 1).equals("name == value")) score += 10;
            else if (questionArr[i].get(answer - 1).equals("중복된 값을 가질 수 없다")) score += 15;
            else if (questionArr[i].get(answer - 1).equals("while")) score += 10;
            else if (questionArr[i].get(answer - 1).equals("def")) score += 5;
        }

        System.out.println("—----- 결과 —-------------");
        System.out.print("응답한 내용 : ");
        for (int i = 0; i < answerList.size(); i++) {
            System.out.print(i + 1 + "번 " + answerList.get(i) + ", ");
        }
        System.out.println("\n당신 응답 합계 : " + score + "점");
        String grade = "";
        if (score > 30) grade = "A";
        else if (score > 20) grade = "B";
        else if (score > 10) grade = "C";
        else grade = "F";
        System.out.println("학점은 " + grade + "입니다");
    }
}