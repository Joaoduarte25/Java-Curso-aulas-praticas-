const obj = { 
  "id_erp": 213503029832.0, 
  "id_ecom": "40651954", 
  "id_produto": 76685.0, 
  "quantidade": 1.0, 
  "valor": 229.9, 
  "status": "Faturado" 
};

const numeroDePropriedades = Object.keys(obj).length;

console.log(numeroDePropriedades); // 6
console.log(`O objeto tem ${numeroDePropriedades} propriedades`);