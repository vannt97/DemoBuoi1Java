public class DemoBuoi3 {
    public static void main(String[] args) {
        Student student = new Student("hoa","nu",23);
        Student student1 = new Student();
        student1.setGioiTinh("nam");
        System.out.println(student1.getGioiTinh());
    }
}
