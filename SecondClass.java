public class SecondClass {

    private FirstClass fistObject;

    public SecondClass(){
        fistObject = new FirstClass();
    }

    public  SecondClass(FirstClass _fistObject){
        fistObject = _fistObject;
    }

    public void setFistObject(FirstClass _fistObject){
        fistObject = _fistObject;
        return;
    }

    public boolean processSomething(FirstClass _fistObject){
        if(!_fistObject.isAdult()){
            return false;
        }
        return _fistObject.isAdult();
    }

    public void complicatedProcessing(){
        FirstClass tmpFirstObject = new FirstClass();
        //tmpFirstObject.getAge();

        /*
        for(;;){
            int tmpCalcResult = 0;
            break;
        }

        int inputCode = 3; // Read from user input
        switch (inputCode){
            case 1 : int tmp = 1; break;
            case 2 : tmp = 5; break;
            case 3 : tmp = 10; break;
            case 4 : tmp = 15; break;
            default: tmp = 12345; break;
        }

        while(true){
            if(tmpFirstObject.isAdult()){
                // Add some code
                if(tmpFirstObject.isRichEnought()){
                    // Add some code
                    if(tmpFirstObject.isHighEducated()){
                        // Add some code
                    }
                    else {
                        // Add some code
                        if(tmpFirstObject.isMilitaried()){
                            // Add some code
                            if (tmpFirstObject.isNameGoodEnought()){
                                // Add some code
                                // Make a decision
                                break;
                            }
                        }
                    }
                }
            }
        }
        */

    }
}
