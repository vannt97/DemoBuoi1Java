public class Student {
    private String name;
    private String gioiTinh;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String gioiTinh, int age){
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.age = age;
    }
    public  Student(){

    }
}
