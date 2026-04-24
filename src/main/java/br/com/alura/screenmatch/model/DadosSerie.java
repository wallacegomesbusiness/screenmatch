package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Anotações importantes
 * O jsonAlias agente pode encontrar por varios nomes exemplo: @JsonAlias({"nomeCompleto","nome"})
 * 0 JsonProperty agente pode informar que determinada informação vai ser outra para serializar por exemplo
 * public class Pessoa{
 * @JsonProperty("nome")
 * private String nomeCompleto;
 * }
 * Ou seja nessa informação ela irar substituir a informação por nome:.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao){
}
