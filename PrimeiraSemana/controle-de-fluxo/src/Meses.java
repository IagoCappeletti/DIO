public class Meses {
    
    public static void main(String[] args) {
        
          iFlecha();
          ifSemFlecha();
          switchFerias();

    }

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias!");
                break;
            default: 
                System.out.println("Mês não indefinido");
                break;
        }
    }

    private static void iFlecha() {
        int mes = 9;
            if (mes == 1) {
                System.out.println("Janeiro");
            } else {
                if (mes == 2) {
                    System.out.println("Fevereiro");
                }else {
                    if (mes == 3) {
                        System.out.println("Março");
                    } else {
                        if (mes == 4) {
                            System.out.println("Abril");
                        }else {
                            if (mes == 5) {
                                System.out.println("Maio");
                            } else {
                                if (mes == 6) {
                                    System.out.println("Junho");
                                } else {
                                    if (mes == 7) {
                                        System.out.println("Julho");
                                    } else {
                                        if (mes == 8) {
                                            System.out.println("Agosto");
                                        } else {
                                            if (mes == 9) {
                                                System.out.println("Setembro");
                                            } else {
                                                if (mes == 10) {
                                                    System.out.println("Outubro");
                                                } else {
                                                    if (mes == 11) {
                                                        System.out.println("Novembro");
                                                    } else {
                                                        if (mes == 12) {
                                                            System.out.println("Dezembro");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }



/**
 * 
 */
private static void ifSemFlecha() {

    int mes = 9;
    if (mes == 1) {
        System.out.println("Janeiro");
    } else if (mes == 2) {
        System.out.println("Favereiro");
    } else if (mes == 3) {
        System.out.println("março");
    }else if (mes == 4) {
        System.out.println("Abril");
    }else if (mes == 5) {
        System.out.println("Maio");
    }else if (mes == 6) {
        System.out.println("Junho");
    } else if (mes == 7) {
        System.out.println("Julho");
    } else if (mes == 8) {
        System.out.println("Agosto");
    }else if (mes == 9) {
        System.out.println("Setembro");
    }else if (mes == 10) {
        System.out.println("Outubro");
    }else if (mes == 11) {
        System.out.println("Novembro");
    }else if (mes == 12) {
        System.out.println("Dezembro");
    } else {
        System.out.println("Mês infefinido!");
    }
}
}


 