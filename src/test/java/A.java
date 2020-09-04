import org.example.verify.rules.NotNull;

/**
 * Date: 2020-09-04 18:11
 * Author: xupp
 */

public class A {
    @NotNull
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
