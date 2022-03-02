package homework.case1.service;


import homework.case1.ICandidateService;
import homework.case1.model.Candidate;

import java.util.Scanner;

public class Candidateservice implements ICandidateService {
    private Candidate[] candidates = new Candidate[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;

    @Override
    public void addNewCandidate() {
        if (count < candidates.length) {
            System.out.print("Mời bạn nhập mã: ");
            String code = scanner.nextLine();
            System.out.print("Mời bạn nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Mời bạn nhập ngày tháng năm sinh: ");
            String dateOfBirth = scanner.nextLine();
            System.out.print("Mời bạn nhập điểm Toán: ");
            double pointOfMath = Double.parseDouble(scanner.nextLine());
            System.out.print("Mời bạn nhập điểm Văn: ");
            double pointOfLiterature = Double.parseDouble(scanner.nextLine());
            System.out.print("Mời bạn nhập điểm Anh: ");
            double pointOfEnglish = Double.parseDouble(scanner.nextLine());
            Candidate candidate = new Candidate(code, name, dateOfBirth, pointOfMath, pointOfLiterature, pointOfEnglish);
            candidates[count] = candidate;
            count++;
        } else {
            System.out.println("Danh sách đã đầy. Không thể thêm mới.");
        }

    }

    @Override
    public void getAll() {
        for (Candidate candidate : candidates) {
            if (candidate == null) {
                break;
            }
            if (candidate.getPointOfEnglish() + candidate.getPointOfLiterature() + candidate.getPointOfMath() > 15) {
                System.out.println(candidate);
            }
        }
    }

    @Override
    public void addMoreCandidate() {
        System.out.print("Mời bạn nhập số lượng cần thêm: ");
        int num = Integer.parseInt(scanner.nextLine());
        if (num + count > 100) {
            System.out.println("Số lượng vượt quá danh sách");
        } else {
            for (int i = 0; i < num; i++) {
                addNewCandidate();
            }
        }
    }
}