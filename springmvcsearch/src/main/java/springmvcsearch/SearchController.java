package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("home page");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url = "https://www.google.com/search?q=" + query;
		RedirectView rv = new RedirectView();
		if (query.isEmpty()) {
			rv.setUrl("home");
		} else {
			rv.setUrl(url);
		}

		return rv;
	}
}
