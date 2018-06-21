public class HelloExtend {
    public static void main(String[] args) {
        StudentExtend s1 = new StudentExtend("liuxiaohu");
        s1.setScore(10);
        System.out.println(s1.getScore());
        System.out.println(s1.getTall());
        s1.run();

        PersonExtend s2 = new StudentExtend("suixiujuan");
        s2.run();
    }





}
