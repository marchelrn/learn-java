package lerch.mtthw.application;

import lerch.mtthw.data.Category;

public class CategoryApp {

    static void main(String[] args) {

        var category = new Category();
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        category.setId("ID");
        category.setId(null);

        System.out.println(category.getId());
    }
}
