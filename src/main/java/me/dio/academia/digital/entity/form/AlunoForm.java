package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o campo")
  @Size(min = 3, max = 30, message = "'${validadeValue}' min {min} e max {max} caracteres.")
  private String nome;
  @NotBlank(message = "Campo obrigatório")
  //@CPF(message = "'${validadeValue}' valor inválido")
  private String cpf;

  @NotBlank(message = "Campo obrigatório")
  @Size(min = 3, max = 30, message = "'${validadeValue}' min {min} e max {max} caracteres.")
  private String bairro;
  @NotNull(message = "Campo obrigatório")
  @Past(message = "'${validadeValue}' valor inválido")
  private LocalDate dataDeNascimento;
}
