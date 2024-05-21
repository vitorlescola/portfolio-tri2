export class Entidade{
    constructor(){
        this.id=Entidade.nextid++
        this.components={};
    }
    adicionarComponent(component){
        this.components[component.constructor.name]=component
    }
    pegarComponent(classComponent){
        return this.component[classComponent.name]
    }
}

Entidade.nextid=0;