package model;

import java.io.Serializable;
import java.util.Date;

public class GiaoDich implements Serializable {

    private SinhVien sinhVien;
    private String tenKhoanThu;
    private TaiKhoanTien napRutTien;
    private Date ngayNop;
    private String soTien;

    public GiaoDich(SinhVien sinhVien, String tenKhoanThu, TaiKhoanTien napTien, Date ngayNop, String soTien) {
        this.sinhVien = sinhVien;
        this.tenKhoanThu = tenKhoanThu;
        this.napRutTien = napTien;
        this.ngayNop = ngayNop;
        this.soTien = soTien;
    }

    public GiaoDich() {
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public String getTenKhoanThu() {
        return tenKhoanThu;
    }

    public void setTenKhoanThu(String tenKhoanThu) {
        this.tenKhoanThu = tenKhoanThu;
    }

    public TaiKhoanTien getNapTien() {
        return napRutTien;
    }

    public void setNapTien(TaiKhoanTien napTien) {
        this.napRutTien = napTien;
    }

    public Date getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(Date ngayNop) {
        this.ngayNop = ngayNop;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sinhVien == null) ? 0 : sinhVien.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GiaoDich other = (GiaoDich) obj;
        if (sinhVien == null) {
            if (other.sinhVien != null) {
                return false;
            }
        } else if (!sinhVien.equals(other.sinhVien)) {
            return false;
        }
        return true;
    }

}
