public class Student {
    int MSSV;
    String name;
    int diemToan;
    int diemLy;
    int diemHoa;
    float diemtb;
    public Student() {
    }

    public Student(int MSSV, String name, int diemToan, int diemLy, int diemHoa) {
        this.MSSV = MSSV;
        this.name = name;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public void setTen(String ten)
    {
        name = ten;
    }
    void setMSSV(int mats)
    {
        MSSV = mats;
    }
    int setdiemToan(int diemtoan)
    {
        diemToan = diemtoan;
        return diemToan;
    }
    int setdiemLy(int diemly)
    {
        diemLy = diemly;
        return diemLy;
    }
    int setdiemHoa(int diemhoa)
    {
        diemHoa = diemhoa;
        return diemHoa;
    }
    float get_diemtb()
    {
        return diemtb;
    }
    void tinhTB()
    {
        diemtb = (diemToan + diemLy + diemHoa)/3;
    }
    public boolean check() {
        return (diemHoa + diemLy + diemToan) > 10 ? true : false;
    }
    public double lamtron(double x){
        if(x<0) return 0;
        if(x>10) return 10;
        return x;
    }
    public static void main(String[] args) {
        int toan,ly, hoa, mats;
        String ten, mats;
        float diemtb;
        // nhap thong tin thi sinh
        System.out .println("Nhap ten sv: "+ten);
        System.out.println("Nhap MSSV: "+mats);
        System.out.println("Nhap diem toan cua sv: "+toan);
        System.out.println("Nhap diem ly cua sv: "+ly);
        System.out.println("Nhap diem hoa cua sv: "+hoa);
        Student sv(mats,ten, toan, ly, hoa);
        System.out.println("Diem trung binh: "+diemtb);
    }
}
