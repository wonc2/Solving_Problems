import java.util.*;

public class Solving_Problems_woncheol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        List<Integer> answerList = new ArrayList<>();

        Integer[] scoreArr = {10, 15, 10, 5};
        String[] quesArr = {"Python에서 변수를 선언하는 방법은?", "Python에서 리스트(List)의 특징은 무엇인가요?",
                "Python에서 조건문을 작성하는 방법은?", "Python에서 함수를 정의하는 방법은?"};
        String[] quesArr01 = {"var name", "name = value", "set name", "name == value"};
        String[] quesArr02 = {"순서가 있고 변경 가능하다", "중복된 값을 가질 수 없다", "원소를 추가하거나 삭제할 수 없다", "정렬된 상태로 유지된다"};
        String[] quesArr03 = {"if-else", "for-in", "while", "def"};
        String[] quesArr04 = {"class", "def", "import", "return"};
        List<String> quesList01 = Arrays.asList(quesArr01);
        List<String> quesList02 = Arrays.asList(quesArr02);
        List<String> quesList03 = Arrays.asList(quesArr03);
        List<String> quesList04 = Arrays.asList(quesArr04);
        List[] questionArr = {quesList01, quesList02, quesList03, quesList04};

        Integer[] indexArr = {0, 1, 2, 3};
        List<Integer> indexList = Arrays.asList(indexArr);
        Collections.shuffle(indexList);

        for (int i = 0; i < quesArr.length; i++) {
            System.out.println((i + 1) + ". " + quesArr[indexArr[i]] + " (점수 : " + scoreArr[indexArr[i]] + "점)");
            Collections.shuffle(questionArr[indexArr[i]]);
            for (int j = 0; j < questionArr[indexArr[i]].size(); j++) {
                if (j > 0) System.out.print(" ");
                System.out.print((j + 1) + ") " + questionArr[indexArr[i]].get(j));
            }
            System.out.print("\n" + "-정답 : ");
            int answer = scanner.nextInt();
            answerList.add(answer);
            if (questionArr[indexArr[i]].get(answer - 1).equals("name == value")) score += scoreArr[indexArr[i]];
            else if (questionArr[indexArr[i]].get(answer - 1).equals("중복된 값을 가질 수 없다")) score += scoreArr[indexArr[i]];
            else if (questionArr[indexArr[i]].get(answer - 1).equals("while")) score += scoreArr[indexArr[i]];
            else if (questionArr[indexArr[i]].get(answer - 1).equals("def")) score += scoreArr[indexArr[i]];
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