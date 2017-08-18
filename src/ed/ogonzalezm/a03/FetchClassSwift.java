/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ogonzalezm.a03;

/**
 *
 * @author HONORIO ZAIBACK
 */
public class FetchClassSwift {
    
import Foundation


class FetchClassSwift {
    var vector: [Int] = []
    func fetch (n: Int) -> Int{
        preconditionFailure("This method must be overridden")
    }
    
    func setV(v: [Int]){
        self.vector = v
    }
    
    func randomV(n:Int)->[Int]{
        var v:[Int] = [Int]()
        for _ in 0...(n-1) {
            v.append(Int(arc4random_uniform(10)))
        }
        return v
    }
    
    func getV()->[Int]{
        return self.vector
    }
    
    func showV(){
        let count:Int = self.vector.count-1
        var string = "["
        for(index) in 0...count{
            string += String(self.vector[index])
            string += ","
        }
        string = String(string.characters.dropLast()) + "]"
        print(string)
    }
    
    func showF(n: Int){
        if(n==(-1)){print("El numero no se encuentra en el vector")}
        else
        {print("El numero se encuentra en la posición \(n)")}
    }
}

protocol Sort(){
    func sort()
}

class binario: FetchClass, Sort{
    override func fetch(n: Int) -> Int {
        var centro: Int = 0
        var inicio: Int = 0
        var fin: Int = self.vector.count-1
        
        while(inicio<=fin){
            centro=(inicio+fin)/2
            
            if(self.vector[centro]==n){return centro}
            
            if(n < self.vector[centro]){
                fin = centro-1
            } else {
                inicio = centro+1
            }
        }
        return -1
    }
    
        func sort(){
            var menor = 0
            var auxiliar = 0
            for index in 0...vector.count-1{
            menor = index
                for index2 in stride(from: index+1, to: vector.count-1, by:1){
                    if(vector[index2<vector[index]]){
                        menor = index2
                    }
            }
                auxiliar = vector[index]
                vector[index] = vector[menor]
                vector[menor] = auxiliar
        }
                
}
}

class secuencial: FetchClass{
    override func fetch(n: Int) -> Int {
        let count : Int = self.vector.count-1
        for i in 0...count{
            if(self.vector[i]==n)
            {return i}
        }
        return -1
    }
}

var test: secuencial = secuencial()
test.setV(v: test.randomV(n: 40))
test.showV()
test.showF(n: test.fetch(n: 20))

var test: binario = binario()
test.setV(v: test.randomV(n: 40))
test.sort()
test.showV()
test.showF(n: test.fetch(n: 20))
    
}
