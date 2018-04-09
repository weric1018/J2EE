package wl.std.j2ee.bean;

import java.math.BigDecimal;

/**
 * Created by ynet_test on 2018/4/4.
 */
public class Account {

    private String name  ;
    private int id ;
    private BigDecimal blance ;

    public Account(String name ,BigDecimal blance){

        this.name = name;
        this.blance = blance ;
    }

    public void setBlance(BigDecimal blance) {
        this.blance = blance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public BigDecimal getBlance() {
        return blance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
