package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("hd case", 80.90));
		list.add(new Product("Tablet", 450.00));

		Function<Product, String> func = p -> p.getName().toUpperCase();

		List<String> names = list.stream().map(func).collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
