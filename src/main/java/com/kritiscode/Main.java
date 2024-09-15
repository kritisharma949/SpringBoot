package com.kritiscode;
import com.kritiscode.customer.CustomerController;
import com.kritiscode.customer.CustomerDataAccessService;
import com.kritiscode.customer.CustomerService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
//@RestController
public class Main {

    //db
//    private static List<Customer> customers;
//
//    static {
//        customers = new ArrayList<>();
//        Customer kriti = new Customer(
//                1,
//                "Kriti",
//                "kriti@gmail.com",
//                25
//
//        );
//        customers.add(kriti);
//
//        Customer priti = new Customer(
//                2,
//                "Priti",
//                "Priti@gmail.com",
//                27
//
//        );
//        customers.add(priti);
//    }


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);
        printBeans(applicationContext);

    }
    @Bean
    public Foo getFoo(){
        return new Foo("bar");
    }
    record Foo(String name){}


        private static void printBeans (ConfigurableApplicationContext ctx) {
//        CustomerService customerService=
//        new CustomerService(new CustomerDataAccessService());
//        CustomerController customerController= new CustomerController(customerService);

        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println(ctx);

    }


//@RequestMapping(path="api/v1/customer", method= RequestMethod.GET)

//    @GetMapping("api/v1/customer")
//    public List<Customer> getCustomers() {
//        return customers;
//    }
//
//    @GetMapping("api/v1/customer/{customerId}")
//    public Customer getCustomer(
//            @PathVariable("customerId") Integer customerId) {
//
//        Customer customer = customers.stream().filter(c -> c.id.equals(customerId)).findFirst().orElseThrow(
//                () -> new IllegalArgumentException("customer with id [%s] not found".formatted(customerId))
//        );
//        return customer;
//    }





//    @GetMapping("/greet")
//    public GreetResponse greet(@RequestParam(value = "name", required = false) String name){
//
//        String greetMessage=name==null||name.isBlank()?"Hello": "Hello "+ name;
//        GreetResponse response=  new GreetResponse(greetMessage, List.of("Java","Php","JavaScript"), new Person("Kriti",22,23000));
//        return response;
//    }
//record Person(String name, int age, double savings){}
//    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person) {}
//    class GreetResponse{
//        private final String greet;
//
//        public GreetResponse(String greet) {
//            this.greet = greet;
//        }
//        public String getGreet() {
//            return greet;
//        }
//
//    @Override
//    public String toString() {
//            return "GreetResponse{" + "grreet='"+greet + '\'' + '}';
//
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GreetResponse that = (GreetResponse) o;
//        return Objects.equals(greet, that.greet);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(greet);
//    }
//}
}

