package homework.case1.controller;


import homework.case1.ICandidateService;
import homework.case1.service.Candidateservice;

import java.util.Scanner;

//Tìm kiếm đúng -> equals (String), == ( số)
    //Tìm kiếm gần đúng -> contains(String), 1 khoảng >,< (số)
//Sắp xếp dùng Arrays.sort() -> class implement Comparable.
public class CandidateController {

    public static void main(String[] args) {
        ICandidateService iCandidateService = new Candidateservice();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add new 1 Candidate");
            System.out.println("2. List all Candidate");
            System.out.println("3. Add n Candidate");
            System.out.println("4. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iCandidateService.addNewCandidate();
                    break;
                case 2:
                    iCandidateService.getAll();
                    break;
                case 3:
                    iCandidateService.addMoreCandidate();
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}