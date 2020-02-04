package se.almstudio.genericsmanager.services;

import java.util.HashSet;

public class SetManager {

    public static void main( String[] args ){
        //Defining 8 sets with two elements, grade for Swedish and grade for English. 7 sets for students and one set is defined as approved to be used for comparision.
        HashSet<String> setstudent1 = new HashSet<String>();
        setstudent1.add("GS");
        setstudent1.add("GE");
        HashSet<String> setstudent2 = new HashSet<String>();
        setstudent2.add("US");
        setstudent2.add("GE");
        HashSet<String> setstudent3 = new HashSet<String>();
        setstudent3.add("GS");
        setstudent3.add("GE");
        HashSet<String> setstudent4 = new HashSet<String>();
        setstudent4.add("GS");
        setstudent4.add("UE");
        HashSet<String> setstudent5 = new HashSet<String>();
        setstudent5.add("US");
        setstudent5.add("UE");
        HashSet<String> setstudent6 = new HashSet<String>();
        setstudent6.add("US");
        setstudent6.add("UE");
        HashSet<String> setstudent7 = new HashSet<String>();
        setstudent7.add("GS");
        setstudent7.add("GE");
        HashSet<String> setapprovedG = new HashSet<String>();
        setapprovedG.add("GS");
        setapprovedG.add("GE");
        // Snitt, store the number of elements which exist in both elev set and approved set to
        int [] compare = new int[7];
        setstudent1.retainAll(setapprovedG);
        compare[0] = setstudent1.size();
        setstudent2.retainAll(setapprovedG);
        compare[1] = setstudent2.size();
        setstudent3.retainAll(setapprovedG);
        compare[2] = setstudent3.size();
        setstudent4.retainAll(setapprovedG);
        compare[3] = setstudent4.size();
        setstudent5.retainAll(setapprovedG);
        compare[4] = setstudent5.size();
        setstudent6.retainAll(setapprovedG);
        compare[5] = setstudent6.size();
        setstudent7.retainAll(setapprovedG);
        compare[6] = setstudent7.size();
        int studentsWhoHavePassedSwedishOrEnglish = 0;
        int studentsWhoHavePassedBothSwedishAndEnglish = 0;
        int studentsWhoHavePassedNeitherSwedishNorEnglish = 0;
        for(int i = 0; i<7; i++) {
            if (compare[i] == 1)
            {
                studentsWhoHavePassedSwedishOrEnglish = studentsWhoHavePassedSwedishOrEnglish + 1;
            }
            else if(compare[i] == 2)
            {
                studentsWhoHavePassedBothSwedishAndEnglish = studentsWhoHavePassedBothSwedishAndEnglish + 1;
            }
            else
            {
                studentsWhoHavePassedNeitherSwedishNorEnglish = studentsWhoHavePassedNeitherSwedishNorEnglish + 1;
            }
        }
        //Printing the result
        System.out.println("students who have passed either Swedish or English course: " + studentsWhoHavePassedSwedishOrEnglish);
        System.out.println("studens who have passed both Swedish and English course: " + studentsWhoHavePassedBothSwedishAndEnglish);
        System.out.println("students who have paased in neither of courses: " + studentsWhoHavePassedNeitherSwedishNorEnglish);
    }
}
