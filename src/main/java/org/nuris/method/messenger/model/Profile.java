package org.nuris.method.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by User on 10.07.2017.
 */

@XmlRootElement()
public class Profile {
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
