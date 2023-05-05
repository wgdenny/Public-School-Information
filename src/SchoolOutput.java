public class SchoolOutput implements SchoolConstants
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Radford City Public Schools.");
        System.out.println("The Superintendent is " + SCHOOL_SUPERINTENDENT);
        System.out.println("The school board office is " +SCHOOL_BOARD_NAME);
        System.out.println("The address for the school board office is " + SCHOOL_BOARD_ADDRESS);
        System.out.println("The school board phone number is " +SCHOOL_BOARD_PHONE_NUMBER);


        ElementarySchool radfordElementary = new ElementarySchool();
        radfordElementary.setEnrollment(410);
        radfordElementary.describeLevel();
        System.out.println("The Principle is " + MCHARG_PRINCIPLE);
        System.out.println("Enrollment is " +
                radfordElementary.getEnrollment());


        ElementarySchool radford2Elementary = new ElementarySchool();
        radford2Elementary.setEnrollment(492);
        radford2Elementary.describeLevel2();
        System.out.println("The Principle is " + BELLE_HEATH_PRINCIPLE);
        System.out.println("Enrollment is " +
                radford2Elementary.getEnrollment());


        IntermediateSchool radfordIntermediate = new IntermediateSchool();
        radfordIntermediate.setEnrollment(234);
        radfordIntermediate.describeLevel();
        System.out.println("The Principle is " + DALTON_PRINCIPLE);
        System.out.println("Enrollment is " +
                radfordIntermediate.getEnrollment());


        HighSchool radfordHigh = new HighSchool();
        radfordHigh.setEnrollment(495);
        radfordHigh.describeLevel();
        System.out.println("The Principle is " + RADFORD_HIGH_PRINCIPLE);
        System.out.println("Enrollment is " +
                radfordHigh.getEnrollment());



    }




}