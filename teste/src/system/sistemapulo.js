import {Posição} from "../components/posição.js"
import {Velocidade} from "../components/velocidade.js"
import {Pulo} from "../components/pulo.js"

export class SistemaPulo{
    atualizar(entidade){
        const posição=entidade.pegarcomponente(Posição);
        const velocidade=entidade.pegarcomponente(Velocidade);
        const pulo=entidade.pegarcomponente(Pulo);

        //aplicar a força do pulo
        if(pulo.estaPulando && posição.y==alturainicial){
            velocidade.y=pulo.forçaPulo*3;
            pulo.estaPulando=false;
        }
    }
}