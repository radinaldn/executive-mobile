package id.topapp.radinaldn.executiveapp.response;

/**
 * Created by radinaldn on 22/11/18.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import id.topapp.radinaldn.executiveapp.model.Mahasiswa;

public class ResponseMahasiswaAngkatan {

    @SerializedName("mahasiswa")
    @Expose
    private List<Mahasiswa> mahasiswa = null;

    public List<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(List<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

}