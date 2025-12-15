package com.MarceloAugustoBra.CRUD_clients.dto;

import com.MarceloAugustoBra.CRUD_clients.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @Size(min = 3, max = 80, message = "O nome precisa ter entre 3 e 80 caracteres.")
    @NotBlank(message = "Campo requerido.")
    private String name;

    @Size(min = 11, max = 11, message = "É obrigatório 11 caracteres para o campo CPF.")
    private String cpf;

    @DecimalMin(value = "1518.00", message = "O salário deve ser no mínimo R$1.518,00")
    private Double income;

    @Past(message = "A data deve ser antes de hoje.")
    private LocalDate birthDate;

    //fiz assim pra não ficar com o valor null.
    @NotNull(message = "O campo não pode ser nulo, se não possui filhos, informe 0")
    private Integer children;

    public ClientDTO(){}

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
