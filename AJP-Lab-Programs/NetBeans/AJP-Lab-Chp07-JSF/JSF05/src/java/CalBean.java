import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "calBean")
@ManagedBean
@ApplicationScoped

public class CalBean {
    int len,br;
    public CalBean() {
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }
    
    public int area(){
        int area = len*br;
        return area;
    }
}
