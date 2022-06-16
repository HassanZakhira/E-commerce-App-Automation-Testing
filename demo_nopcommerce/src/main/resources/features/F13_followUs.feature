@smoke
Feature: Click of Follow us Links

  Scenario:   opens facebook link
    When  opens facebook link
    Then go to correct Tab And check URl "https://www.facebook.com/nopCommerce"

  Scenario: opens twitter link
    When opens twitter link
    Then go to correct Tab And check URl "https://twitter.com/nopCommerce"

  Scenario: opens YouTube link
    When opens YouTube link
    Then go to correct Tab And check URl "https://www.youtube.com/user/nopCommerce"

  Scenario: opens rss link
    When opens rss link
    Then go to correct Tab And check URl "https://demo.nopcommerce.com/news/rss/1"

