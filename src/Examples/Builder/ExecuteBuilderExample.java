package Examples.Builder;

import Examples.Example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExecuteBuilderExample implements Example {
    @Override
    public String getExampleName() {
        return "Builder";
    }

    @Override
    public void execute() {
        Post post = new Post.Builder()
                .title("Receta de pizza")
                .text("Hongos, pepperoni y mucho queso :)")
                .solo_amigos(true)
                .build();

        IO.println(post);
    }
}