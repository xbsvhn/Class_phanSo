public class phanSo {
    /*int tuso;
    int mauso;

    public static void main(String[] args) {
        phanSo ps1 = new phanSo();
        ps1.tuso = 2;
        ps1.mauso = 4;
        System.out.println("PS1: " + ps1.tuso + "/" + ps1.mauso);
        //nghich dao
        phanSo psi = nghichDao(ps1);
        System.out.println("PS1 nghich dao: " + psi.tuso + "/" + psi.mauso);

        phanSo ps2 = new phanSo();
        ps2.tuso = 3;
        ps2.mauso = 4;
        System.out.println("PS2: " + ps2.tuso + "/" + ps2.mauso);
        //nghich dao
        phanSo psu = nghichDao(ps2);
        System.out.println("PS2 nghich dao: " + psu.tuso + "/" + psu.mauso);
        phanSo ps3 = cong(ps1, ps2);
        System.out.println("Tong 2 PS: " + ps3.tuso + "/" + ps3.mauso);
        phanSo ps4 = tru(ps1, ps2);
        System.out.println("Hieu 2 PS: " + ps4.tuso + "/" + ps4.mauso);

    }


    static phanSo cong(phanSo a, phanSo b) {
        phanSo ketqua = new phanSo();
        ketqua.tuso = a.tuso * b.mauso + b.tuso * a.mauso;
        ketqua.mauso = a.mauso * b.mauso;
        return ketqua;
    }
    static phanSo tru(phanSo a, phanSo b) {
        phanSo ketqua = new phanSo();
        ketqua.tuso = a.tuso * b.mauso - b.tuso * a.mauso;
        ketqua.mauso = a.mauso * b.mauso;
        return ketqua;
    }
    static phanSo nghichDao(phanSo a) {
        phanSo ketqua = new phanSo();
        ketqua.tuso = a.mauso;
        ketqua.mauso = a.tuso;
        return ketqua;
    }

}*/

    private int tu, mau;

    public phanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void congPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoTong = new phanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

    public void truPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoHieu = new phanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }

    public void nhanPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoTich = new phanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
    public void chiaPhanSo(phanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        phanSo phanSoThuong = new phanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);

    }
    public static void main(String[] args) {
        phanSo phanSo1=new phanSo(16,3);
        phanSo phanSo2=new phanSo(4,8);
//Hien thi phan so
        System.out.println("Phân số 1 = " + phanSo1.tu + "/" + phanSo1.mau);
        System.out.println("Phân số 2 = " + phanSo2.tu + "/" + phanSo2.mau);

        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
}