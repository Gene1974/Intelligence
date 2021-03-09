package com.ngn.intelligence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


@Controller
@SpringBootApplication
public class IntelligenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelligenceApplication.class, args);
	}

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String process_controller_home() {
        System.out.println("[INFO]Welcome!");
        return "00_Platform";
    }


    @RequestMapping(value = "tools", method = RequestMethod.GET)
    public String init_tools() {
        return "01_tools";
    }

    @RequestMapping(value = "tools/Snopes", method = RequestMethod.GET)
    public String init_tools_snopes() {
        return "tools/Snopes";
    }
    /*
    @RequestMapping(value = "tools/Snopes/{feature}", method = RequestMethod.POST)
    @ResponseBody
    public String process_tools_snopes(@PathVariable("feature") String feature, @RequestParam("snopes_searching_text") String snopes_searching) throws IOException{
        System.out.println("[INFO]Begin getting " + feature + " ...");
        String result = ProcessPython.process_snopes_searching(snopes_searching);
        System.out.println("[SUCCESS]Get " + feature + "complete!");
        return result;
    }*/
    @RequestMapping(value = "tools/Snopes/searching", method = RequestMethod.POST)
    @ResponseBody
    public String tools_snopes_searching(@RequestParam("snopes_searching_text") String snopes_searching) throws IOException{
        return ProcessPython.process_snopes_searching(snopes_searching);
    }
    @RequestMapping(value = "tools/Snopes/latest", method = RequestMethod.POST)
    @ResponseBody
    public String tools_snopes_latest(){
        return ProcessPython.process_snopes_latest();
    }
    @RequestMapping(value = "tools/Snopes/hot", method = RequestMethod.POST)
    @ResponseBody
    public String tools_snopes_hot(){
        return ProcessPython.process_snopes_hot();
    }
    @RequestMapping(value = "tools/Snopes/fact", method = RequestMethod.POST)
    @ResponseBody
    public String tools_snopes_fact(){
        return ProcessPython.process_snopes_fact();
    }
    @RequestMapping(value = "tools/Snopes/collections", method = RequestMethod.POST)
    @ResponseBody
    public String tools_snopes_collections(){
        return ProcessPython.process_snopes_collections();
    }
    @RequestMapping(value = "tools/Snopes/news", method = RequestMethod.POST)
    @ResponseBody
    public String tools_snopes_news(){
        return ProcessPython.process_snopes_news();
    }
    @RequestMapping(value = "tools/Snopes/archives", method = RequestMethod.POST)
    @ResponseBody
    public String tools_snopes_archives(){
        return ProcessPython.process_snopes_archives();
    }



    @RequestMapping(value = "tools/Melissa", method = RequestMethod.GET)
    public String init_tools_melissa() {
        return "tools/Melissa";
    }
    @RequestMapping(value = "tools/Melissa/zipcode", method = RequestMethod.POST)
    @ResponseBody
    public String tools_melissa_zipcode(@RequestParam("melissa_zipcode") String zipcode) throws IOException{
        return ProcessPython.process_melissa_zipcode(zipcode);
    }

    @RequestMapping(value = "tools/GoogleTrends", method = RequestMethod.GET)
    public String init_tools_googletrends() {
        return "tools/GoogleTrends";
    }
    @RequestMapping(value = "tools/TalkWalker", method = RequestMethod.GET)
    public String init_tools_talkwalker() {
        return "tools/TalkWalker";
    }

    @RequestMapping(value = "database", method = RequestMethod.GET)
    public String init_database() {
        return "02_database";
    }

    @RequestMapping(value = "service", method = RequestMethod.GET)
    public String init_service() {
        return "03_service";
    }

    @RequestMapping(value = "application", method = RequestMethod.GET)
    public String init_application() {
        return "04_application";
    }

    @RequestMapping(value = "contact", method = RequestMethod.GET)
    public String init_contact() {
        return "05_contact";
    }

}
