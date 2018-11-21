package br.edu.utfpr.reclamaguarapuava.model.dto;

import br.edu.utfpr.reclamaguarapuava.model.Category;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@Data
public class CategoryDTO {

    private Long id;

    @NotEmpty(message = "O nome não pode ser vazio")
    @Length(min = 2, max = 100, message = "O nome da categoria deve conter no mínimo 2 e máximo 100 caracteres.")
    private String name;

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public CategoryDTO(Optional<Category> category) {
        this.id = category.get().getId();
        this.name = category.get().getName();
    }

}
