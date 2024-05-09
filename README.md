<h1><b1>Project Overview</b1></h1>

Develop a gifts list application. You are provided with
a Postman file that contains all the APIs for this app.
1. All the data returned by the APIs is in JSON format.
2. All the network calls should be done in a background thread.
3. All UI changes, updates and edits should be performed on the main thread.

<h2><b1>Part 0, Authentication and Flow:</b1></h2>
You are provide with the authentication screens and the comments will indicate how you
can retrieve the access token which is required to make the API calls. Please check the
provide files to access the authentication token. Please follow the steps:
1. All the API calls will require an “Authorization” header with the “BEARER token” in
order to make the api calls.

![31](https://github.com/ashvinibalte/MobileApplicationGiftListApp/assets/125997432/55ce72f0-2877-432b-b0fc-4eaa193cdf0c)

<h2><b1>Part 1, Gift Lists:</b1></h2>

This screen displays a list of gift lists as shown in Figure 1(a). Please follow the steps:

1. Retrieve the gift lists for the currently logged user using the “/api/giftlists/lists” API:
a. Note that this API requires the Authorization header to include the token
b. Make the api request and then parse the JSON response.
c. Refresh the displayed list to show the different gift lists as shown in Figure 1(a).
2. Each row item should display gift list name, total number items and total cost of the
gift list
3. Clicking the trash can in a row item should delete the selected gift list by calling the
delete gifts “/api/giftlists/delete” API:
a. Note that this API requires the Authorization header to include the token
b. Retrieve the update gift lists by calling the “/api/giftlists/lists” API, parsing the
JSON and then refresh the displayed list.
4. Clicking the “Add New” button should:a. Transition to the the Create Gift List screen.
b. Upon returning this screen refresh the list of Gift Lists by retrieving the shopping
gift lists by calling the “/api/giftlists/lists” API.
5. Clicking on a row item should:
a. Transition to the Gift List screen, send it the selected GiftList object.
b. Upon returning this screen refresh the list of Gift Lists by retrieving the shopping
gift lists by calling the “/api/giftlists/lists” API.

<h2><b1>Part 2, Create Gift List Screen:</b1></h2>

This screen is a form that is used to create new gift list. This screen also maintains a list
of products that will be added to the new gift list, please follow the steps:
1. Retrieve the list of products using the “/api/giftlists/products” API:
a. Note that this API requires the Authorization header to include the token
b. Make the api request and then parse the JSON response.
c. Refresh the displayed list to show the products retrieved and set the count for
each product to 0 as shown in Figure 1(b).
2. Each row item should display the product name, price, image and the count selected
for each product as shown in Figure 1(b).
3. Note that this screen also displays the “Overall Cost” which is the sum of the cost of
all the products selected and displayed in the list.
4. Clicking on the “+” icon should:
a. Increment the count for the selected product by 1, refresh the list to display the
updated row.
b. Update the “Overall Cost” display to accommodate the changed count.
5. Clicking on the “1” icon should:
a. Decrement the count for the selected product by 1, refresh the list to display the
updated row.
b. Update the “Overall Cost” display to accommodate the changed count.
6. Clicking on the Submit button should:
a. If the name is not entered or no products selected then show a toast message
indicating the missing form input.
b. If all the required data is entered correctly then:
- Call the “/api/giftlists/new” API to add the gift list to the server. After the API is
completed successfully then go back to the Gifts List screen.
- Note that this API requires the Authorization header to include the token
  
<h2><b1>Part 3, Gift List Screen:</b1></h2>

This screen display the details of specific Gift List as shown in Figure 2(a). Please follow
the steps:
1. Display the products list associated with the current Gift List object as shown in
Figure 2(a).
2. Note that this screen also displays the “Overall Cost” which is the sum of the cost of
all the products selected and displayed in the list.
3. Clicking on the “+” icon should:
a. Call the “/api/giftlists/add-item” API. Note that this API requires the Authorization
header to include the token.
b. After the API returns then increment the count for the selected product by 1,
refresh the list to display the updated row.
c. Update the “Overall Cost” display to accommodate the changed count.
4. Clicking on the “-” icon should:
a. Call the “/api/giftlists/remove-item” API. Note that this API requires the
Authorization header to include the token.
b. After the API returns then decrement the count for the selected product by 1,
refresh the list to display the updated row.
c. Update the “Overall Cost” display to accommodate the changed count.
5. Clicking the “Back” button should go back to the Gift Lists Screen

![32](https://github.com/ashvinibalte/MobileApplicationGiftListApp/assets/125997432/1a404f62-9ddb-4889-ac10-e059071f6532)


