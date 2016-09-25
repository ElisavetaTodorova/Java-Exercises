package p07CompanyHierarchy;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Sale {
    //product name, date and price.
    private String productName;
    private Date productDate;
    private double productPrice;

    public Sale(String productName, Date productDate, double productPrice) throws ParseException {
        this.productName = productName;
        setProductDate(productDate);
        this.productPrice = productPrice;
    }

    private void setProductDate(Date productDate)  {

        this.productDate = productDate;
    }
}
