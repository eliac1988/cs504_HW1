package demo.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfo {

    private String username;
    private String address;

    public UserInfo(){
        //this.username = "";
    }

    @JsonCreator
    public UserInfo(@JsonProperty("username") String username, @JsonProperty("address") String address) {
        this.username = username;
        this.address = address;
    }
}
