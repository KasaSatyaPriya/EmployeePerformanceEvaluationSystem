public class EmployeePerformanceEvaluationSystem {
    public static void main(String[] args){
        String employeeName = "Rahul Sharma";
        String department = "IT";
        double rating = 4.6;
        int attendance = 95;
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Department : "+department);
        System.out.println("Rating : "+rating);
        System.out.println("Attendence : "+attendance);
        //Performance Level
        if(rating >= 4.5){
            System.out.println("Performance Level : Outstanding");
        }else if(rating >= 4.0){
            System.out.println("Performance Level : Excellent");
        }else if(rating >= 3.0){
            System.out.println("Performance Level : Good");
        }else if(rating >= 2.0){
            System.out.println("Performance Level : Average");
        }else{
            System.out.println("Performance Level : Poor");
        }
        //Promotion Eligibility
        if(rating >= 4.0 && attendance >= 90){
            System.out.println("Promotion Eligibility : Eligible for Promotion");
        }
        //Bonus Percentage
        if(rating >= 4.0){
            System.out.println("Bonus Percentage : Bonus = 20%");
        }else{
           System.out.println("Bonus Percentage : Bonus = 5%");
        }
        //Department Benefits
        switch(department){
            case"IT":
                System.out.println("Department Benefits : Laptop Upgrade");
                break;
            case"HR":
                System.out.println("Department Benefits : Leadership Training");
                break;
            case"Finance":
                System.out.println("Department Benefits : Certification Program");
                break;
            case"Marketing":
                System.out.println("Department Benefits : Conference Pass");
                break;
            default:
                System.out.println("Department Benefits : General Benefits");
        }
    }
}
