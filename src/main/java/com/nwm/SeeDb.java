package com.nwm;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SeeDb {

    @Autowired
    JdbcTemplate template;

    @PostConstruct
    public void init(){
        template.update("insert into NODE(LOCATION,LATITUDE,LONGITUDE,NAME) VALUES (?,?,?,?)","Athlone",53.425049,-7.944620,"Ericsson Business Park");
        template.update("insert into NODE(LOCATION,LATITUDE,LONGITUDE,NAME) VALUES (?,?,?,?)","Dublin",53.2025,-6.200348,"PoolBeg");
        template.update("insert into NODE(LOCATION,LATITUDE,LONGITUDE,NAME) VALUES (?,?,?,?)","Guatemala",14.4200,-91.264857,"San Pedro");
    }
}
