package Grop6;

 class Marks {
     double getPercentage() {
         return 0;
     }
 }

class studentA extends Marks{
    double subject1;
    double subject2;
    double subject3;
    studentA(double subject1,double subject2, double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;

    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3;
    }
}
class studentB extends Marks{
    double subject1;
    double subject2;
    double subject3;
    double subject4;
    studentB(double subject1,double subject2, double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4;
    }
}

class MarksTester{
    /*
     We have to calculate the average of marks obtained in three subjects by student A and by student B.
     Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average
      percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
      The constructor of student A takes the marks in three subjects as its parameters and the marks
      in four subjects as its parameters for student B. Test your code
    */
    public static void main(String[] args) {
        Marks[] tasks={ new studentA(70,76,78),
                new studentB(70,76,78,89)};
        for (Marks task:tasks){
            System.out.println("average % "+ task.getPercentage());
        }
    }
}
