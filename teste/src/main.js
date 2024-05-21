import {Entidade} from "../entities/entities.js"
import {Posição} from "../components/posição.js"
import {Velocidade} from "../components/velocidade.js"
import {Pulo} from "../components/pulo.js"
import {SistemaPulo} from "../system/sistemapulo.js"

const canvas=document.getElementById('gameCanvas');
const contexto=canvas.getContext('2d');

canvas.widht=800;
canvas.height=600;

const alturainicial=canvas.height-200;

const jogador=new Entidade();
jogador.adicionarComponent(new Posição(100,alturainicials))