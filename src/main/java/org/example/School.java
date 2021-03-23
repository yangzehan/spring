package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("school")
public class School {
    private String city,xiaoqu;

    public String getCity() {
        return city;
    }

    public String getXiaoqu() {
        return xiaoqu;
    }
@Value("仓山")
    public void setXiaoqu(String xiaoqu) {
        this.xiaoqu = xiaoqu;
    }
 @Value("厦门")
    public void setCity(String city) {
        this.city = city;

    }

    @Override
    public String toString() {
        return "School{" +
                "city='" + city + '\'' +
                ", xiaoqu='" + xiaoqu + '\'' +
                '}';
    }
}
